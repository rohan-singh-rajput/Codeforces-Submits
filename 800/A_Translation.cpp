// #include <iostream>
// #include <cstring>
// using namespace std;

// char freq[26];

// int main()
// {
//     memset(freq, 0, sizeof(freq));

//     string first, second;
//     cin >> first >> second;

//     if (first.length() != second.length())
//     {
//         cout << "NO\n";
//         return 0;
//     }

//     for (int i = 0; i < first.length(); i++)
//     {
//         char a = first[i];
//         char b = second[i];

//         if (a == b)
//         {
//             cout << "NO\n";
//             return 0;
//         }

//         if (freq[a - 'a'] != 0 && freq[a - 'a'] != b)
//         {
//             cout << "NO\n";
//             return 0;
//         }

//         if (freq[b - 'a'] != 0 && freq[b - 'a'] != a)
//         {
//             cout << "NO\n";
//             return 0;
//         }

//         freq[a - 'a'] = b;
//         freq[b - 'a'] = a;
//     }

//     cout << "YES\n";
//     return 0;
// }
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    string s, t;
    cin >> s >> t;

    reverse(s.begin(), s.end());

    if (s == t)
        cout << "YES\n";
    else
        cout << "NO\n";

    return 0;
}
