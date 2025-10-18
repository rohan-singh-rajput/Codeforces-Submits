#include <algorithm>
#include <iostream>
#include <string>
#include <vector>
#include <set>
#include<map>

using namespace std;

#define F first
#define S second
#define REP(i, a, b) for (int i = a; i <= b; i++)
#define SQ(a) a *a

typedef long long ll;
typedef vector<int> vi;
typedef pair<int, int> pi;

#define input(n) std::cin >> n;
#define print(n) std::cout << n << "\n";
#define upper(in) std::transform(in.begin(), in.end(), in.begin(), ::toupper);
#define lower(in) std::transform(in.begin(), in.end(), in.begin(), ::tolower);

void fastInputOutput() {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);
}

int main() {

  // freopen("input.txt", "r", stdin);
  // freopen("output.txt", "w", stdout);
  string in;
  cin>>in;

  int n = in.length();

  for(int i=0;i<in.size();i++){
    if(i < n &&in[i+1]=='-' && in[i]=='-'){
        cout<<2;
    }else if(i<n && in[i]=='-'&&in[i+1]=='.'){
        cout<<1;
    }else{
        cout<<0;
    }
  }
  cout<<endl;

  return 0;
}
