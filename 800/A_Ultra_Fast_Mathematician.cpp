#include <iostream>

using namespace std;

int main(void)
{
    string s1, s2;
    cin >> s1 >> s2;

    for (int i = 0; i < s1.length(); i++)
    {
        int element1 = s1[i] - '0';
        int element2 = s2[i] - '0';

        cout << (element1 ^ element2);
    }

    cout << endl;

    return 0;
}