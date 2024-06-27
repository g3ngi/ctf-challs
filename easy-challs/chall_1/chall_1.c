#include <stdio.h>

// chall asm

int add_modded(int a, int b){
    int c;
    int d;
    c = a + b;
    d = c + 20;
    return d;
}

int main(){   
    add_modded(10, 25);
    return 0;
}