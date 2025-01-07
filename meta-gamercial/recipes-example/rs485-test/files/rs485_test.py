import serial
import fcntl
import struct
import os
import termios

def enable_rs485_mode(port_fd):
    # RS485 enable constant (found in `/usr/include/linux/serial.h`)
    TIOCSRS485 = 0x542F

    # RS485 configuration struct (refer to Linux kernel docs)
    rs485_config = struct.pack(
        'IHHII', 
        0x00000001,  # RS485 enabled
        0,           # Delay before send (in microseconds)
        0,           # Delay after send (in microseconds)
        0,           # GPIO RTS pin (if hardware-specific)
        0            # Flags (e.g., RS485 RTS-on-send or RTS-after-send)
    )

    # Set RS485 mode using ioctl
    fcntl.ioctl(port_fd, TIOCSRS485, rs485_config)

def configure_rs485(port):
    try:
        ser = serial.Serial(port, baudrate=9600, timeout=1)
        fd = ser.fileno()  # File descriptor for the port

        enable_rs485_mode(fd)  # Enable RS485 mode
        print "RS485 mode enabled on", port

        hex_data = ""  # String to accumulate hex data
        while True:
            data = ser.read(ser.inWaiting())  # Read all available data
            if data:
                # Convert each byte to hex and add to the accumulated string
                hex_data += ' '.join('{:02X}'.format(ord(byte)) for byte in data) + " "

                # Print accumulated hex data on the same line
                print "\rReceived (Hex):", hex_data,  # '\r' to return to the beginning of the line
                # Flush output to ensure it's printed immediately
                sys.stdout.flush()

    except OSError as e:
        print "Error accessing the port:", e
    except serial.SerialException as e:
        print "Serial error:", e
    except KeyboardInterrupt:
        print "\nExiting..."
    finally:
        if 'ser' in locals() and ser.isOpen():
            ser.close()
            print "Serial port closed."

if __name__ == "__main__":
    import sys
    RS485_PORT = "/dev/ttymxc3"  # Update with your RS485 port
    configure_rs485(RS485_PORT)
