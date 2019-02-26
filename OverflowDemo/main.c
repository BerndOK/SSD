/* 
 * File:   main.c
 * Author: cenuser
 *
 * Created on February 26, 2019, 10:16 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    unsigned int ui = 0;
    signed int us = 0;
    
    int i;
    for (i = 1; i <= 50; i++) {
        printf("%20d\t%20u\n",ui,us);
        ui += 100000000;
        us += 100000000;
    }
}

