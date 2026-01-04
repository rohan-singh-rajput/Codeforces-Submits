#include <iostream>
#include <map>

using namespace std;

int main(void)
{

    int n;
    cin >> n;

    map<int, int> mpp;
    int i = 1;

    while (n--)
    {
        int temp;
        cin >> temp;

        mpp[temp] = i++;
    }

    for (auto it : mpp)
    {
        cout << it.second << " ";
    }

    cout << endl;

    return 0;
}