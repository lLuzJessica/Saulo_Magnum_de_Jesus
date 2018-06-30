create database ProvaLiaxSaulo;
use provaliaxsaulo;
create table if not exists Alunos(
contrato char(15) not null primary key,
nome varchar(50) not null,
pai varchar(50) default 'Não Informado',
mae varchar(50) not null,
idade int not null
);

create table if not exists Disciplinas(
codigo varchar(5) not null primary key,
disciplina varchar(50) not null,
dataInicio varchar(10)not null,
dataFinal varchar(10),
ementa varchar(256) not null
);

create table if not exists Alunos_Disciplinas(
contrato char(15) not null,
codigo char (5) not null,
constraint pk_AlunoDisciplina primary key (contrato,codigo),
constraint fk_AlunoDisciplina2 foreign key (contrato) references Alunos(contrato),
constraint fk_AlunoDisciplina3 foreign key (codigo) references Disciplinas(codigo)
);

create view AlunoCurso as Select A.nome, D.disciplina from disciplinas as D ,alunos as A 
inner join alunos_disciplinas as AD on(A.contrato = AD.contrato) 
where AD.contrato = 'XXXXXX' order by A.nome,D.disciplina;
