#include <iostream>
using  namespace std;
namespace CRYCHIC{
    const char *vocals = "Riko";
    const char *keyboard = "Maki";
    const char *guitar = "Hanayo";

}

namespace MYGO{
    using CRYCHIC::vocals;
    const char *guitar[2] = {"Eli","Nozomi"};
}

int main(){
    {
        using namespace CRYCHIC;
        cout<<vocals<<endl;
    }
    {
        using namespace MYGO;
        cout<<vocals<<endl;
        cout<<guitar[1]<<vocals<<guitar[0]<<"\n";
    }
}