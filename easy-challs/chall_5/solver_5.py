import base64
from Crypto.Cipher import AES

encFlag = base64.b64decode("Lu26m0tN0pRLrlxOTl12MA==")
key = b'OneStepCloserrrr'
cipher = AES.new(key, AES.MODE_ECB)
flag = cipher.decrypt(encFlag).decode()
print(flag)


