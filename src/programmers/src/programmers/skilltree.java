package programmers;

class Solution {
    public int solution(String skill, String[] skill_trees) {
         int answer = skill_trees.length;//가능한 스킬 트리의 개수
            int beidx = 0, nidx = 0;//beidx=이전 인덱스, nidex=현재 인덱스
            
            for (int i = 0; i < skill_trees.length; i++) {
                beidx = skill_trees[i].indexOf(skill.charAt(0));
                //이전 인덱스 변수에 제일 먼저 시작하는 선수 스킬의 인덱스 값을 넣는다
                for (int i2 = 1; i2 < skill.length(); i2++) {
                    nidx = skill_trees[i].indexOf(skill.charAt(i2));
                    //현재 인덱스 변수에 스킬의i값이 든 변수의 값을 입력받는다
                    if(beidx > nidx && nidx != -1) {
                        answer--;//가능하지 않으니 -
                        break;
                    } //nidx의 값이 0이 아니고 bidx의 값이 nidx보다 클 때 브레이크 (선수 스킬이 뒤에 있을때)
                    else if  (beidx == -1 && nidx!= -1){
                        answer--;//가능하지 않으니 -
                        break;
                    } //nidx의 값이 0이 아니고 bidx의 값이 -1일때 브레이크 (선수 스킬이 없을 경우)
                    beidx = nidx;//앞의 두 경우 전부 다 아닐 때 다음 인덱스 값은 이전 인덱스로 이전
                }
            }
            return answer;
        }
    }