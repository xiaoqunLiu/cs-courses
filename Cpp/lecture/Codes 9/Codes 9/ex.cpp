#include <iostream>
#include "ex.hpp"
int main()
{
    const char *name = "coc";
    {
        printf("%s\n",name);
printf("%s\n",LoveLive::name);
extern const char *name;
        printf("%s\n",::name);
    }
    return 0;
}