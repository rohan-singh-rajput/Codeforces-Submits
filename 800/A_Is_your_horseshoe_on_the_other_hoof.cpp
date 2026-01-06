#include <iostream>
#include <map>
// #include <bits/stdc++.h>
using namespace std;

int main(void)
{
    map<long long, int> freq;

    for (int i = 0; i < 4; i++)
    {
        long long int currNum;
        cin >> currNum;

        if (freq[currNum] == 0)
        {
            freq[currNum] = 1;
        }
        else
        {
            freq[currNum] += 1;
        }
    }

    int cntBuys = 0;

    for (auto it : freq)
    {
        if (it.second > 1)
        {
            cntBuys += (it.second - 1);
        }
    }

    cout << cntBuys << endl;

    return 0;
}