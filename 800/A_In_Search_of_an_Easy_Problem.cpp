#include <iostream>

using namespace std;

int main(void)
{

    int n;
    cin >> n;

    bool res = false;

    while (n-- != 0)
    {
        int temp;
        cin >> temp;

        if (temp == 1)
        {
            res = true;
        }
    }

    if (res)
    {
        cout << "HARD\n";
    }
    else
    {
        cout << "EASY\n";
    }
}