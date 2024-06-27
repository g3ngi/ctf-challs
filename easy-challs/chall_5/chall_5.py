# exe -> .pyc -> .py
import base64
from Crypto.Cipher import AES
from Crypto.Util.Padding import pad

def encrypt_flag():
    real_flag = "FLAG{luka}" 
    key = b'OneStepCloserrrr'
    cipher = AES.new(key, mode=AES.MODE_ECB)
    enc_flag = cipher.encrypt(pad(real_flag.encode(), AES.block_size))
    print(base64.b64encode(enc_flag))


def main():

    print("Congrats you decompiled me!")
    print("now try to find the flag")

    encrypt_flag()

if __name__ == "__main__":
    main()