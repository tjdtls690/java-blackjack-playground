# 기능 요구 사항

## 입력
- [x] 입력받은 플레이어 이름 문자열을 쉼표 구분자로 나눠서 플레이어들 객체 생성
- [ ] 딜러 객체 생성
- [ ] 배팅
  - [ ] 배팅 안내문 출력
  - [ ] 배팅 금액 입력받기

## 출력
- [ ] 게임 진행 과정 출력
  - [ ] 중간중간 플레이어, 딜러의 카드 상태 출력 
- [ ] 게임 참여 이름 입력 안내문
- [ ] 결과 출력
  - [ ] 카드 최종 상태와 합계 출력
  - [ ] 최종 수익금 출력

## 도메인
- [ ] 게임 진행 규칙
  - [ ] 플레이어는 게임을 시작할 때 배팅 금액을 정한다.
  - [ ] 게임을 시작하면 딜러와 플레이어는 두 장의 카드를 지급 받는다.
- [ ] 카드 계산 규칙
  - [ ] 카드의 숫자 계산은 카드 숫자를 기본으로 한다.
  - [ ] Ace는 1 또는 11로 계산할 수 있다.
  - [ ] King, Queen, Jack은 각각 10으로 계산한다.
- [ ] 카드 연속 뽑기 여부
  - [ ] 플레이어
    - [ ] 합이 21을 넘지 않는 경우 계속 뽑을 수 있다.
      - [ ] 계속 뽑을거면 계속 진횅
      - [ ] 안 뽑을거면 해당 플레이어 행동 정지
    - [ ] 단, 21을 초과할 경우 게임을 패배해서 더이상 뽑지 못한다.
  - [ ] 딜러
    - [ ] 처음 받은 2장의 합계가 16 이하이면 반드시 1장 추가로 뽑기
    - [ ] 처음 받은 2장의 합계가 17 이상이면 추가로 뽑기 불가능
- [ ] 승리 조건
  - [ ] 플레이어
    - [ ] 딜러의 카드 숫자 합이 21을 넘었을 때, 그 즉시 남아있는 플레이어들은 실시간 승리
    - [ ] 게임 종료 후, 카드 숫자 합이 21 이하이면서 21에 제일 가까운 플레이어만 승리
  - [ ] 딜러
    - [ ] 게임 종료 후, 플레이어보다 카드 숫자 합이 21 이하이면서 21에 더 가까울 때 해당 플레이어들로부터 승리
    - [ ] 합이 21을 초과한 해당 플레이어들로부터 승리
- [ ] 무승부 조건
  - [ ] 딜러와 플레이어가 모두 동시에 블랙잭인 경우
  - [ ] 딜러와 플레이어의 합이 같은 경우
- [ ] 게임 종료 조건
  - [ ] 카드를 다시 뽑으려는 플레이어와 딜러가 전혀 없을 때.
  - [ ] 딜러의 카드 합이 21을 초과할 때
- [ ] 보상 체계
  - [ ] 플레이어
    - [ ] 플레이어 승리시, 본인이 배팅한 금액을 받는다.
    - [ ] 처음 받은 두 장의 합이 바로 21일 때, 배팅금액의 1.5배를 받는다. 
    - [ ] 플레이어 패배시, 본인이 배팅한 금액을 잃는다.
    - [ ] 딜러와 무승부인 플레이어는 베팅한 금액을 돌려받는다.
  - [ ] 딜러
    - [ ] 딜러에게 진 모든 플레이어들에게 해당 플레이어들의 배팅금액을 받는다.
    - [ ] 딜러에게 이긴 모든 플레이어들에게 해당 플레이어들의 배팅금액을 잃는다. 

기능 요구 사항
블랙잭 게임을 변형한 프로그램을 구현한다. 블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.

플레이어는 게임을 시작할 때 배팅 금액을 정해야 한다. ㅡ
카드의 숫자 계산은 카드 숫자를 기본으로 하며, ㅡ
예외로 Ace는 1 또는 11로 계산할 수 있으며, ㅡ
King, Queen, Jack은 각각 10으로 계산한다. ㅡ
게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, ㅡ
두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다. ㅡ
21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다. ㅡ
단, 카드를 추가로 뽑아 21을 초과할 경우 배팅 금액을 모두 잃게 된다. ㅡ
처음 두 장의 카드 합이 21일 경우 블랙잭이 되면 베팅 금액의 1.5 배를 딜러에게 받는다. ㅡ
딜러와 플레이어가 모두 동시에 블랙잭인 경우 플레이어는 베팅한 금액을 돌려받는다. ㅡ
딜러는 처음에 받은 2장의 합계가 16이하이면 반드시 1장의 카드를 추가로 받아야 하고, ㅡ
17점 이상이면 추가로 받을 수 없다. ㅡ
딜러가 21을 초과하면 그 시점까지 남아 있던 플레이어들은 가지고 있는 패에 상관 없이 승리해 베팅 금액을 받는다. ㅡ





블랙잭 게임을 변형한 프로그램을 구현한다. 
블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.

플레이어는 게임을 시작할 때 배팅 금액을 정해야 한다. ㅡ
카드의 숫자 계산은 카드 숫자를 기본으로 하며, 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다. ㅡ
게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, ㅡ 
두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다. ㅡ 
21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다. ㅡ
    단, 카드를 추가로 뽑아 21을 초과할 경우 배팅 금액을 모두 잃게 된다. ㅡ
처음 두 장의 카드 합이 21일 경우 블랙잭이 되면 베팅 금액의 1.5 배를 딜러에게 받는다. ㅡ
딜러와 플레이어가 모두 동시에 블랙잭인 경우 플레이어는 베팅한 금액을 돌려받는다. ㅡ
딜러는 처음에 받은 2장의 합계가 16이하이면 반드시 1장의 카드를 추가로 받아야 하고, 17점 이상이면 추가로 받을 수 없다. ㅡ
딜러가 21을 초과하면 그 시점까지 남아 있던 플레이어들은 가지고 있는 패에 상관 없이 승리해 베팅 금액을 받는다.