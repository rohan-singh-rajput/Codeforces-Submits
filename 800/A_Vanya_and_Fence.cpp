#include <iostream>

using namespace std;

int main(void)
{
    int n, k;
    cin >> n >> k;

    int res = 0;
    while (n-- > 0)
    {
        int temp;
        cin >> temp;

        if (temp <= k)
        {
            ++res;
        }
        else
        {
            res += 2;
        }
    }

    cout << res << endl;

    return 0;
}