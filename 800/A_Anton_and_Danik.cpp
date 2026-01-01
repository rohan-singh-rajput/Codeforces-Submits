#include <iostream>
#include <string>

using namespace std;

int main(void)
{
    int n;
    cin >> n;

    int c_a = 0;
    int c_d = 0;

    while (n--)
    {
        char ch;
        cin >> ch;

        if (ch == 'A')
        {
            ++c_a;
        }
        else if (ch == 'D')
        {
            ++c_d;
        }
    }

    if (c_a > c_d)
    {
        cout << "Anton\n";
    }
    else if (c_d > c_a)
    {
        cout << "Danik\n";
    }
    else
    {
        cout << "Friendship\n";
    }

    return 0;
}