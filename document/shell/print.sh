#! /bin/bash
name=chenxun #����
age=26 #����
echo �ҽ�$name,����$age��,�����ҵ�һ��shell�ű�!
echo HOME=$HOME
echo PWD=$PWD
echo USER=$USER
echo UID=$UID
echo SHELL=$SHELL
echo ---------------------------
if [ $UID -ne 0 ]; then
 echo ������ͨ�û�
else
 echo ����root�û�
#������ɺ��޸�Ȩ�� ��chmod a+x xx.sh