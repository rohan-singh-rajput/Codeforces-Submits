#include <iostream>

using namespace std;

int32_t main(void)
{
    string in;

    cin >> in;

    int cnt = 0;

    for (auto ch : in)
    {
        if (ch == '4' || ch == '7')
        {
            ++cnt;
        }
    }

    if (cnt == 4 || cnt == 7)
    {
        cout << "YES\n";
    }
    else
    {
        cout << "NO\n";
    }

    return 0;
}
