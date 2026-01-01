#include <iostream>

using namespace std;

int main(void)
{
    long long int n;
    cin >> n;

    if (n % 2 == 0)
    {
        cout << (long long)(n / 2) << endl;
    }
    else
    {
        cout << (long long)(-1 * (n + 1) / 2) << endl;
    }
    return 0;
}