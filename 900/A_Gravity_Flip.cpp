#include <iostream>
#include <vector>

using namespace std;

int main(void)
{
    int n;
    cin >> n;

    vector<int> columns(n);

    for (int i = 0; i < n; i++)
    {
        cin >> columns[i];
    }

    sort(columns.begin(), columns.end());

    for (int column : columns)
    {
        cout << column << " ";
    }

    cout << endl;

    return 0;
}