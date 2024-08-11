#include <string>
#include <cstdlib> // (or stdlib.h) for rand(), srand()
#include <ctime> // (or time.h) for time()
#include <cstring>

class Cat
{
public:
    int age;
    std::string name;
    Cat(int a, std::string n): age(a), name(n){}

};