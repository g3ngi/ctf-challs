#include <stdio.h>
#include <strings.h>
#include <stdlib.h>
#include <unistd.h>

// chall c, solve pake gdb

int main(){
    char password[50];
    char secret[50] = "flag{lesgoo_bisa_crack_pw_pake_gdb}";

    printf("Welcome to the Vault\n");
    printf("Please enter the vault password");
    scanf("%s", password);

    if(strcmp(secret, password) == 0){
        printf("congrats you're in, here's the flag !\n");
        printf("%s", secret);
    } else{
        printf("wrong, please enter the correct password !");
    }

    
    return 0;
}