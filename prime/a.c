#include <stdio.h>
#include <math.h>

int last = 1;
int was_prime = 0;
int final;
int c;

static int is_prime(int inp){
	if(inp == last) goto ret;
	if(inp%2 == 0){
		was_prime = inp == 2;
		goto ret;
	}

	if(inp%3==0){
		was_prime = inp == 3;
		goto ret;
	}

	if(inp%5==0){
		was_prime = inp == 5;
		goto ret;
	}

	if(inp%7==0){
		was_prime = inp == 7;
		goto ret;
	}
	
	final = (int) sqrt(inp)+2;

	for(c=11; c < final; c+=2){
		if(inp %c == 0) goto not_prime;
	}
	
	was_prime = 1;
	goto ret;


not_prime:
	was_prime = 0;

ret:	
	last = inp;
	return was_prime;
}


static void read_ints (const char* file_name)
{
  FILE* file = fopen (file_name, "r");
  int i = 0;

  fscanf (file, "%d", &i);    
  while (!feof (file))
    {  
	printf("%d\n", is_prime(i));
	
	    
        fscanf (file, "%d", &i);      
    }
  fclose (file);        
}

int main(int argc, char *argv[]){
 	printf("argv[1] : %s\n",argv[1]);
	read_ints(argv[1]);	

	return 0;
}

