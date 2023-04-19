#include <iostream>
#include <cstring>

using namespace std;

int main() {
    char buffer[10];
    int a = 10;
    int b = 1000000000;

    cout << "Enter your name: ";
    gets(buffer);
    cout << "Hello, " << buffer << endl;

    int c = a * b;
    cout << "Result: " << c << endl;

    char* s = "Test";
    printf(s);
    printf("\n");

    return 0;
}
