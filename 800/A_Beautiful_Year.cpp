#include <iostream>

using namespace std;

bool check(int year)
{

    int freq[10];

    for (int i = 0; i < 10; i++)
    {
        freq[i] = 0;
    }
    while (year != 0)
    {
        int num = year % 10;
        freq[num]++;

        year = year / 10;
    }

    for (int i = 0; i < 10; i++)
    {
        if (freq[i] > 1)
        {
            return false;
        }
    }

    return true;
}

int main(void)
{
    int n;
    cin >> n;

    int res = 0;

    for (int curr_year = n + 1; curr_year <= 9999; ++curr_year)
    {

        if (check(curr_year))
        {
            cout << curr_year << endl;
            break;
        }
    }

    return 0;
}