#include <iostream>

using namespace std;

int main(void)
{
    int tc;
    cin >> tc;

    while (tc-- > 0)
    {

        string s;
        cin >> s;

        int n = stoi(s);
        int lo = 0, hi = 100;

        bool found = false;
        int x = 0;

        while (lo <= hi)
        {
            int mid = (lo + hi) / 2;
            long long sq = 1LL * mid * mid;

            if (sq == n)
            {
                x = mid;
                found = true;
                break;
            }
            else if (sq < n)
            {
                lo = mid + 1;
            }
            else
            {
                hi = mid - 1;
            }
        }

        if (!found)
        {
            cout << -1 << '\n';
        }
        else
        {
            cout << 0 << " " << x << '\n';
        }
    }

    return 0;
}