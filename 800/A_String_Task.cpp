#include <iostream>
#include <cctype>

using namespace std;

int main()
{
    char ch;

    while (cin >> ch)
    {
        if (ch != 'A' && ch != 'O' && ch != 'Y' && ch != 'E' &&
            ch != 'U' && ch != 'I' && ch != 'a' && ch != 'o' &&
            ch != 'y' && ch != 'e' && ch != 'u' && ch != 'i')
        {
            if (ch >= 'A' && ch <= 'Z')
                ch = ch + ('a' - 'A');
            cout << "." << ch;
        }
    }

    cout << endl;
    return 0;
}
