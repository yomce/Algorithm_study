# 🧩 Algorithm Study

SW Expert Academy 문제를 중심으로 알고리즘 문제 풀이를 기록하는 스터디 Repository입니다.

각자 문제를 직접 풀고 코드를 공유하며, 서로의 풀이 방식을 비교하고 학습하는 것을 목표로 합니다.

---

## 📁 Repository Structure

폴더 구조는 아래 규칙을 따릅니다.

```text
SWEXPERT
├── 깃허브아이디1
│   ├── D1
│   │   ├── Q1936.java
│   │   ├── Q2025.java
│   │   └── Q2072.java
│   │
│   ├── D2
│   │   ├── Q1204.java
│   │   └── Q1284.java
│   │
│   └── D3
│       └── Q1206.java
│
├── 깃허브아이디2
│   ├── D1
│   ├── D2
│   └── D3
│
└── 깃허브아이디3
    ├── D1
    ├── D2
    └── D3
```

기본 구조는 다음과 같습니다.

```text
SWEXPERT
└── 깃허브아이디
    └── 난이도
        └── 문제번호.java
```

예시:

```text
SWEXPERT/yomce/D2/Q1288.java
```

---

## 📝 파일 작성 규칙

### 1. 이름 폴더

`SWEXPERT` 아래에 본인의 깃허브아이디로 폴더를 생성합니다.

```text
SWEXPERT/yomce
```

### 2. 난이도 폴더

SW Expert Academy의 문제 난이도를 기준으로 폴더를 생성합니다.

```text
D1
D2
D3
D4
...
```

### 3. Java 파일명

문제 번호 앞에 `Q`를 붙여 작성합니다.

```text
Q2072.java
Q1204.java
Q1288.java
```

클래스명도 파일명과 동일하게 작성합니다.

```java
public class Q2072 {
    public static void main(String[] args) {

    }
}
```

---

## 💻 문제 풀이 방법

1. Repository를 Clone합니다.
2. STS에서 프로젝트를 불러옵니다.
3. 자신의 깃허브아이디 폴더로 이동합니다.
4. 문제 난이도에 맞는 폴더를 선택합니다.
5. `Q문제번호.java` 파일을 생성합니다.
6. 문제를 풉니다.
7. 실행하여 정답 여부를 확인합니다.
8. Commit 후 Push합니다.

---

## 🌿 Git 사용 방법

### 작업 시작 전

다른 사람이 올린 최신 코드를 먼저 받아옵니다.

```bash
git pull
```

### 문제 풀이 후

변경된 파일을 확인합니다.

```bash
git status
```

변경사항을 추가합니다.

```bash
git add .
```

Commit합니다.

```bash
git commit -m "solve: D2 1288 새로운 불면증 치료법"
```

GitHub에 Push합니다.

```bash
git push
```

---

## 📌 Commit Message Convention

문제를 새로 풀었을 경우:

```text
solve: 난이도 문제번호 문제이름
```

예시:

```text
solve: D1 2072 홀수만 더하기
solve: D2 1288 새로운 불면증 치료법
solve: D3 1206 View
```

기존 풀이를 수정한 경우:

```text
fix: 난이도 문제번호 수정내용
```

예시:

```text
fix: D2 1288 풀이 수정
```

프로젝트 구조나 설정 등을 변경한 경우:

```text
chore: 변경내용
```

예시:

```text
chore: 프로젝트 폴더 구조 수정
```

---

## ⚠️ 주의사항

### 자신의 폴더에서 작업하기

기본적으로 자신의 깃허브아이디 폴더 안에서만 문제를 작성합니다.

```text
SWEXPERT/내깃허브아이디/
```

다른 스터디원의 코드는 자유롭게 참고할 수 있지만, 특별한 이유가 없다면 다른 사람의 코드를 직접 수정하지 않습니다.

### 작업 전 `git pull`

여러 명이 같은 Repository를 사용하기 때문에 작업 시작 전에 최신 코드를 받아오는 것을 권장합니다.

```bash
git pull
```

작업 완료 후에는 다음 순서로 올립니다.

```bash
git add .
git commit -m "solve: D2 1288 새로운 불면증 치료법"
git push
```

---

## 🎯 Study Goal

* 꾸준한 알고리즘 문제 풀이
* Java 문법 및 자료구조 숙달
* 알고리즘 문제 해결 능력 향상
* 다른 사람의 풀이를 통한 다양한 접근 방법 학습
* Git / GitHub 협업 방식 익히기

---

## 🔗 Problem Site

### SW Expert Academy

https://swexpertacademy.com/
