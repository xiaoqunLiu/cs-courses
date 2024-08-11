// brass.h -- bank account classes
#ifndef BRASS_H_
#define BRASS_H_
#include <string>
// Brass Account Class
class Brass
{
    private:    
    std::string fullName;
    long acctNum;
    double balance;
    
    public:
    Brass(const std::string & s = "Nullbody", long an = -1,double bal = 0.0);
    void Deposit(double amt);
    virtual void Withdraw(double amt);
    double Balance() const;
    virtual void ViewAcct() const;
    virtual ~Brass() {}
};

//Brass Plus Account Class
class BrassPlus : public Brass
{
    private:
    double maxLoan;
    double rate;
    double owesBank;
    
    public:
    BrassPlus(const std::string & s = "Nullbody", long an = -1,double bal = 0.0, double ml = 500,double r = 0.11125);
    
    BrassPlus(const Brass & ba, double ml = 500,double r = 0.11125);
    
    virtual void ViewAcct()const; // 继承的时候，如果父类的方法是虚函数，那么子类的方法也是虚函数
    // 虚函数的作用是，当父类指针指向子类对象的时候，调用的是子类的方法，而不是父类的方法，子类的方法可以覆盖父类的方法
    virtual void Withdraw(double amt);
    void ResetMax(double m) { maxLoan = m; }
    void ResetRate(double r) { rate = r; };
    void ResetOwes() { owesBank = 0; }
};
#endif