#include <iostream>
#include <string>

using namespace std;

int main()
{
    string in;
    cin >> in;

    string target = "hello";
    int j = 0;
    int i = 0;
    while (i < target.length() && j < in.length())
    {
        if (target[i] == in[j])
        {
            i++;
        }
        j++;
    }

    if (i == target.length())
    {
        cout << "YES\n";
    }
    else
    {
        cout << "NO\n";
    }

    return 0;
}