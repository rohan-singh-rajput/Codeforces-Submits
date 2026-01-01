#include <iostream>

using namespace std;

int main(void)
{
    int n;
    cin >> n;

    int empty_rooms = 0;

    while (n-- > 0)
    {
        int p, q;
        cin >> p >> q;

        if (p + 2 <= q)
        {
            ++empty_rooms;
        }
    }

    cout << empty_rooms << endl;
    return 0;
}