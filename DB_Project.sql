-- 고객정보 
CREATE TABLE CUSTOMER(
    USER_NUMBER NUMBER(10) PRIMARY KEY,
    NAME VARCHAR2(20) NOT NULL,
    USER_ID VARCHAR2(8) UNIQUE CHECK(LENGTH(USER_ID)<=8 AND LENGTH(USER_ID)>=5),
    USER_PW VARCHAR2(12) CHECK(LENGTH(USER_PW)<=12 AND LENGTH(USER_PW)>=8),
    RRN CHAR(13) UNIQUE,
    CREDIT_SCORE NUMBER(4) NOT NULL,
    PHONE_NUM CHAR(13),
    EMAIL VARCHAR2(30),
    JOB VARCHAR2(15) NOT NULL,
    INCOME NUMBER(10) NOT NULL,
    BANK VARCHAR2(10) NOT NULL,
    ACCOUNT NUMBER(20) NOT NULL,
    PREF NUMBER(1) NOT NULL
);

-- 고객번호 부여 시퀀스 
CREATE SEQUENCE USER_NUMBER
INCREMENT BY 1
START WITH 1000
NOCYCLE
NOCACHE;

-- -- 기존 고객 15명 생성 

INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'zzangu11','z12345678', '신짱구', '950101-1234567', 820, 800 ,'010-1234-5678', 'zzanguzz@naver.com', '직장인', 3500, '우리은행', 1002541425);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'yuri0110','dbfl1122', '차유리', '010921-2222452', 780, 777 ,'010-5689-1478', 'yuri11@google.com', '개인사업자', 2800, '국민은행', 1145268752);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'ccccsu89','ceolsu0502', '김철수', '890808-1245785', 970, 963 ,'010-4577-1112', 'cccsu89@naver.com', '전문직', 10000, '신한은행', 7895842561);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'choihh00','huunnni11', '최훈이', '000920-1457889', 520, 500 ,'010-5568-1254', 'huni00@daum.net', '무직', 600, '하나은행', 5425698874);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'songmg','930707sz', '송맹구', '940920-1225458', 888, 820 ,'010-7874-9293', 'mang09@naver.com', '직장인', 8000, '신한은행', 7721547852);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'mimi0224','alal2244', '봉미선', '770224-2245771', 810, 786 ,'010-3722-0224', 'mimi0224@daum.net', '무직', 2400, '우리은행', 1002225556);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'shinhs55','gudtlr112', '신형식', '750505-1125789', 832, 805 ,'010-3722-0505', 'hs0505@naver.com', '직장인', 6000, '우리은행', 1002222478);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'white01','gmlsenddl1', '이흰둥', '980101-1233569', 890, 857 ,'010-6259-7593', 'white0101@naver.com', '무직', 3600, '하나은행', 5456552111);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'nanana22','alfl0325', '나미리', '931101-2234567', 757, 699 ,'010-6525-7784', 'miri22@google.com', '직장인', 3000, '우리은행', 1002541568);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'zzanga22','za12345678', '신짱아', '970201-2256125', 840, 831 ,'010-1234-5573', 'zzangazz@naver.com', '직장인', 2600, '우리은행', 1002255698);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'suzy1993','930707sz', '김수지', '930707-2255124', 839, 768 ,'010-7854-0707', 'szlove@naver.com', '개인사업자', 5000, '신한은행', 7789554658);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'cahsaa86','sungaaa86', '채성아', '860407-2254665', 869, 832 ,'010-8686-5667', 'sunga86@hanmail.net', '공무원', 2830, '국민은행', 1111542582);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'osuu0921','suuuuu2121', '오오수', '830921-1145789', 630, 580 ,'010-0921-1371', 'osu1@naver.com', '무직', 1200, '신한은행', 2585889745);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'jeongh11','park11112', '박정훈', '871111-1244587', 750, 720 ,'010-2554-9980', 'jh1111@naver.com', '공무원', 4000, '신한은행', 8896657845);
INSERT INTO CUSTOMER(USER_NUMBER, USER_ID, USER_PW, NAME, RRN, CREDIT_SCORE_N, CREDIT_SCORE_K, PHONE_NUM, EMAIL,JOB, INCOME, BANK, ACCOUNT)
VALUES (USER_NUMBER.NEXTVAL, 'mimikim','rlaalal1', '김미미', '901108-2236598', 899, 920 ,'010-2554-1108', 'szlove@naver.com', '공무원', 2400, '신한은행', 8745879544);

-- 대출 상품 번호 부여 시퀀스
CREATE SEQUENCE PRODUCT_NUMBER
INCREMENT BY 1
START WITH 1
NOCYCLE
NOCACHE;

-- 대출 상품
CREATE TABLE LOAN_PRODUCT (
  PRODUCT_NUMBER NUMBER(10) PRIMARY KEY,
  PRODUCT_NAME VARCHAR2(50) NOT NULL,
  BANK_NAME VARCHAR2(20),
  RATE NUMBER(5),
  MAX_LOAN NUMBER(10),
  MAX_MONTH NUMBER(2),
  JOB VARCHAR2(15) NOT NULL
);

INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, '주거래 직장인 대출', '우리', 5, 200, 60, '무직');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, '비상금 대출', '우리', 6.9, 3, 12, '무직');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, '사잇돌 중금리 대출', '우리', 7.12, 20, 60, '무직');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, '홈 마스터론', '우리', 6.05, 10, 60, '무직');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, '새 희망 홀씨 2', '우리', 6.7, 35, 84, '직장인');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, '쏠편한 직장인 대출 S', '신한', 6.3, 100, 60, '직장인');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, '쏠편한 직장인 대출', '신한', 7, 50, 60, '직장인');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, '쏠편한 포켓론', '신한', 8.5, 5, 48, '무직');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, '쏠편한 일반 공무원 대출', '신한', 5.5, 70, 60, '공무원');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, 'SOHO CSS 사이버론', '신한', 6.7, 50, 60, '개인사업자');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, '하나원큐 새 희망 홀씨 2', '하나', 5.5, 100, 60, '직장인');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, 'AI 대출', '하나', 7.5, 30, 60, '무직');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, '핀크 생활비 대출', '하나', 13.9, 5, 48, '무직');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, 'BEST 신용 대출', '하나', 6.8, 50, 60, '직장인');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, '전문직 클럽 대출', '하나', 7, 300, 120, '전문직');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, 'KB 직장인 든든 신용 대출', '국민', 6, 300, 60, '직장인');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, 'KB 새 희망 홀씨 2', '국민', 8, 50, 36, '무직');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, 'KB 국민 ONE 대출', '국민', 7, 20, 48, '무직');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, 'KB 온 국민 신용 대출', '국민', 6, 100, 36, '직장인');
INSERT INTO LOAN_PRODUCT(PRODUCT_NUMBER, PRODUCT_NAME, BANK_NAME, RATE, MAX_LOAN, MAX_MONTH, JOB)
VALUES (PRODUCT_NUMBER.NEXTVAL, 'KB 공무원 우대 대출', '국민', 5, 10, 72, '공무원');

-- 대출 실행 건별 번호 부여 시퀀스
CREATE SEQUENCE LOAN_NUMBER
INCREMENT BY 1
START WITH 1
NOCYCLE
NOCACHE;

-- 고객 대출 정보
CREATE TABLE LOAN_INFO(
  LOAN_NUMBER NUMBER(10) PRIMARY KEY,
  USER_NUMBER NUMBER(10) REFERENCES CUSTOMER(USER_NUMBER),
  NAME VARCHAR2(20) NOT NULL,
  PRODUCT_NUMBER NUMBER(10) REFERENCES LOAN_PRODUCT(PRODUCT_NUMBER),
  PRODUCT_NAME VARCHAR2(50),
  RATE NUMBER(5),
  MAX_LOAN NUMBER(10),
  MAX_MONTH NUMBER(2),
  PERIOD NUMBER(2)
);

-- 게시판
CREATE TABLE BOARD (
  BOARD_NUMBER NUMBER(10) PRIMARY KEY,
  BOARD_NAME VARCHAR2(30) UNIQUE 
);

-- 고객의소리(게시판)
CREATE TABLE WRITE (
  WRT_NUM NUMBER(10) PRIMARY KEY,
  BOARD_NAME VARCHAR2(30) REFERENCES BOARD(BOARD_NAME),
  TITLE VARCHAR2(30) NOT NULL,
  CONTENTS VARCHAR2(50),
  WRT_DATE DATE,
  USER_ID VARCHAR2(8) REFERENCES CUSTOMER(USER_ID)
);

-- 댓글 
CREATE TABLE REPLY (
COMMENT_NUM NUMBER(10) PRIMARY KEY,
WRT_NUM NUMBER(10) REFERENCES WRITE(WRT_NUM),
COMMNET_CON VARCHAR2(50),
USER_ID VARCHAR2(8) REFERENCES CUSTOMER(USER_ID)
);