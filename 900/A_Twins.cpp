#include <iostream>
#include <vector>

using namespace std;

int main(void)
{

    int n;
    cin >> n;

    vector<int> coins(n);

    int totalSum = 0;

    for (int i = 0; i < n; i++)
    {
        cin >> coins[i];
        totalSum += coins[i];
    }

    sort(coins.begin(), coins.end());

    int maxHalfSum = 0;

    int sumCnt = 0;

    int idx = n - 1;

    while (idx >= 0 && maxHalfSum <= (totalSum / 2))
    {
        maxHalfSum += coins[idx];
        sumCnt++;
        --idx;
    }

    cout << sumCnt << endl;

    return 0;
}