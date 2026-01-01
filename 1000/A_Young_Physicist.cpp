#include <iostream>

using namespace std;

int main(void)
{
    int a = 0;
    int b = 0;
    int c = 0;

    int t;
    cin >> t;

    while (t-- > 0)
    {
        int t_a, t_b, t_c;
        cin >> t_a >> t_b >> t_c;

        a += t_a;
        b += t_b;
        c += t_c;
    }

    if (a == 0 && b == 0 && c == 0)
    {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }

    return 0;
}