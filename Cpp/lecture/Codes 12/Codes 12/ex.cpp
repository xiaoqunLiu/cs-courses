#include <iostream>
#include <cstring>

using namespace std;
class baseClass{
public:
    char data[128];
    baseClass(const char* s) {
    strcpy(this->data, s);
    };
};

    int main() {
        char str[]="qwerty";
        baseClass b1(str);
        baseClass b2=b1;
        cout << (&b1.data )<<endl;
        cout << (&b2.data )<<endl;
        cout << (b1.data>b2.data )<<endl;
        cout << (b1.data==b2.data )<<endl ;
        cout << (b1.data<b2.data)<<endl;
        return 0;
    }
