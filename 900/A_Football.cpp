#include <iostream>

using namespace std;

int main(void)
{

    string str;
    cin >> str;

    int n = str.length();

    int cnt = 1;

    int maxCnt = 1;

    for (int i = 1; i < n; i++)
    {
        if (str[i] == str[i - 1])
        {
            ++cnt;
            maxCnt = max(maxCnt, cnt);
        }
        else
        {
            cnt = 1;
        }
    }

    if (maxCnt >= 7)
    {
        cout << "YES\n";
    }
    else
    {
        cout << "NO\n";
    }

    return 0;
}