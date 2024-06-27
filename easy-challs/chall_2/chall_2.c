#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>

// chall c, solve pake gdb

int main(){
    char password[50];
    char flag[50] = "flag{lesgoo_bisa_crack_pw_pake_gdb}";
    char secret[50] = "arlott_dmg_>>_arlott_tank";

    printf("Welcome to the Vault\n");
    printf("Please enter the vault password: ");
    scanf("%s", password);    

    if(strcmp(secret, password) == 0){
        printf("congrats you're in, here's the flag !\n");
        printf("%s\n", flag);
    } else{
        printf("wrong, please enter the correct password !\n");
    }    
    return 0;
}