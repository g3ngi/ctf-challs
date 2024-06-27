#include <stdio.h>

// chall c, solve pake scripting

void encrypt(){
    printf("Where's the flag? somethings missing...\n");
    char fakeflag[21] = "this_flag_is_redacted";
    char encrypted[21] = "4b51464c80716e706a646e647c667379647e747a82";
    printf("Encrypted Flag: ");
    for(int i=0; i<21;i++){
        printf("%x", fakeflag[i] + 5);
    }
}

void random(){
    for(int i=0; i<20; i++){
        printf("zZz\n");
    }
}

void testing(){
    printf("i don't know what's this function do..");
}

int main(){
    printf("Lets warm up your static analysis skills with this ez chall\n");
    random();
    return 0;
}