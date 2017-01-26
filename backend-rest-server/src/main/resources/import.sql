insert into users(username, password, last_password_reset, authorities) values('user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', null, 'USER')
insert into users(username, password, last_password_reset, authorities) values('admin', '$2a$10$ZycoxDeODIyi9MmY/d8D..9w0e7o5lVEZ0gJJQ/N5bPbhX63DLbKa', null, 'ADMIN, ROOT')
insert into users(username, password, last_password_reset, authorities) values('expired', '$2a$10$PZ.A0IuNG958aHnKDzILyeD9k44EOi1Ny0VlAn.ygrGcgmVcg8PRK', parsedatetime('01-JAN-2050','dd-MMM-yyyy'), 'USER')
