#include <iostream>

using namespace std;

int main(void)
{
    int n;
    cin >> n;

    char initialMagnet[2];

    for (int i = 0; i < 2; i++)
    {
        cin >> initialMagnet[i];
    }

    int groups = 1;

    n -= 1;
    while (n-- > 0)
    {
        char currMagnet[2];

        for (int i = 0; i < 2; i++)
        {
            cin >> currMagnet[i];
        }

        if (initialMagnet[1] == currMagnet[0])
        {
            ++groups;
        }

        for (int i = 0; i < 2; i++)
        {
            initialMagnet[i] = currMagnet[i];
        }
    }

    cout << groups << endl;

    return 0;
}