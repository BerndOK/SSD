/* 
 * File:   main.c
 * Author: cenuser
 *
 * Created on February 13, 2019, 12:06 PM
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define LIM 6
/*
 * 
 */
int main(int argc, char** argv) {
    char *p = malloc(LIM);
    memset(p,5,LIM);
    return (EXIT_SUCCESS);
}

