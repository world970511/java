package programmers;

class Solution {
    public int solution(String skill, String[] skill_trees) {
         int answer = skill_trees.length;//������ ��ų Ʈ���� ����
            int beidx = 0, nidx = 0;//beidx=���� �ε���, nidex=���� �ε���
            
            for (int i = 0; i < skill_trees.length; i++) {
                beidx = skill_trees[i].indexOf(skill.charAt(0));
                //���� �ε��� ������ ���� ���� �����ϴ� ���� ��ų�� �ε��� ���� �ִ´�
                for (int i2 = 1; i2 < skill.length(); i2++) {
                    nidx = skill_trees[i].indexOf(skill.charAt(i2));
                    //���� �ε��� ������ ��ų��i���� �� ������ ���� �Է¹޴´�
                    if(beidx > nidx && nidx != -1) {
                        answer--;//�������� ������ -
                        break;
                    } //nidx�� ���� 0�� �ƴϰ� bidx�� ���� nidx���� Ŭ �� �극��ũ (���� ��ų�� �ڿ� ������)
                    else if  (beidx == -1 && nidx!= -1){
                        answer--;//�������� ������ -
                        break;
                    } //nidx�� ���� 0�� �ƴϰ� bidx�� ���� -1�϶� �극��ũ (���� ��ų�� ���� ���)
                    beidx = nidx;//���� �� ��� ���� �� �ƴ� �� ���� �ε��� ���� ���� �ε����� ����
                }
            }
            return answer;
        }
    }