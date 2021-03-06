# Антонина Климчук - "Glimpz"
# Пользовательские сценарии

### Группа: 10 - И - 1
### Электронная почта: hggty1804@gmail.com
### VK: www.vk.com/tonyaklm


### [ Сценарий 1 - Регистрация пользователя ]

1. Пользователь вводит логин, с которым он будет заходить в систему
2. Пользователь вводит пароль, с которым он будет заходить в систему
3. Пользователь вводит адрес электронной почты, который будет использоваться в системе
4. Если выбранный логин уже существует в системе, то пользователю сообщается об этом и предлагается придумать новый логин
5. Если пароль содержит менее 6 символов, система сообщает, что пароль должен быть от 6 до 20 символов и пользователь должен придумать новый пароль
6. Если все введённые данные соответствуют требованиям регистрации, то система отправляет на почту письмо для подтверждения почты
7. После подтверждения имейла система приветствует пользователя и переходит в диалог выбора режима работы .
8. Запускается Сценарий 2 - Выбор режима работы.

### [ Сценарий 2 - Выбор режима работы]

1. Пользователь выбирает один из трех профилей: a) учащиеся начальных классов б)учащиеся средней и старшей школы; в)учашиеся вузов и выпустившиеся из вузов
2. Приложение спрашивает, хочет ли пользователь прочитать список доступных книг.
3. Если пользователь выбирает "Да", на экран выводится назания книг и их описание.
4. Если "Нет", то пользователь остаётся на этапе выбора до тех пор, пока не нажмёт "Далее".
5. Пользователь переходит к выбору книг.
6. Пользователю доступна функция: скачать книгу или читать онлайн.
7. Пользователь может начинать пользоваться книгами приложения.

### [ Сценарий 3 - Создание собственного профиля ]
1. На экране появляется список доступных книг. Пользователь сначала выбирает одну из перечисленных.
2. Пользователь может добавлять интересные ему книги в "Избранное".
3. Также для пользователя есть отдельный список прочитанных им книг.
4. Далее программма спрашивает уверен ли он в выборе книг и если да, то пользователь нажимает "OK".
5. Далее программа ещё раз спрашивает пользователя, уверен ли он в том, что он хочет финализировать созданный профиль. У пользователя есть возможность вернуться к предыдущему выбору.


### [ Сценарий 4 - Выбор книги]
1. Пользователь переходит в новое окно с выбором жанра книги.
2. В зависимости от жанра выводится список книг, удовлетворяющих этому виду.
3. Пользователь должен нажать на понравившуюся ему книгу.
4. Для каждой книги есть краткое описание и Фотография книги.
5. Под каждой книгой есть кнопочка "Избранное". 
6. Запускается сценарий 5- Режим чтения книги.

### [ Сценарий 5- Режим чтения книги]
1. Внизу каждой книги есть две кнопки на выбор: "режим скорочтения" или "свободный режим".
2. Если пользователь выбрал свободный режим, то у него есть выбор скачать книгу или читать онлайн.
3. В режиме скорочтения есть база для пользователей со временем чтения страницы: 2 минуты первые 10 страниц.Через каждые 15 страниц время уменьшается на 5 секунды, пока не станет 50 секунд.
4. Пользователь, если справился быстрее, может нажать "далее" и перейти к следующей странице.
5. Пользователь в любой момент может выйти из режима скорочтения , нажав на кнопку "Выйти из режима". Иначе страницы будут перелистываться самы в зависимости от времени.
6. После прочтения книги вне зависимости от режима программа переходит к Сценарию 6- Вопросы после прочтения.

### [ Сценарий 6 - Вопросы после прочтения]
1. Далее пользователю, у которого режим скорочтения в обязательном порядке нужно пройти тест после книги. Тест состоит из 10 вопросов, из которых 7 на общее понимание текста и 3 на внимательность.
2. Для пользователей в свободном режиме также предусмотрен тест, но в свободном режиме участник может отказаться.
3. Для пользователей, прошедших тест составляется собственный рейтинг по прочитанным книгам и баллам за тесты. Так пользователи смогут посмотреть свои результаты и улучшения.
4. Также для всех участников данной игры с режимом скорочтения существует общий рейтинг с результатами тестов.
5. У пользователя, прошедшего тест есть возможность оценить книгу по пятибальной шкале(не обязательно).
6. Запускается сценарий 7 - Комментарии пользователей.
### [ Сценарий 7 - Возможность составления тестов пользователей]
1. Полсе прочтения книги пользователь может нажать кнопку под описанием книги "Составить свой тест".
2. Для пользователя открывается новое окно, в котором написаны правила создания теста. Пользоваель должен составить тест из 5 вопросов, в каждом из которых 4 варианта ответов.
3. После прочтения правил, пользователь нажимает кнопку "Прочитал правила создания".
4. Далее открывается сама страница, на которой будет создаваться тест. Пользователь вводит вопрос, затем правильный ответ и через enter вводит 3 неправильных. В дальнейшем приложение будет само размещать в произвольном порядке ответы (чтобы правильный отвте не был на первом месте)и сохранять созданный тест.
5. Созданный тест будет виден своему создателю, и пользователь может пройти его в любой момент.

### [ Сценарий 7 - Комментарии пользователей ]
1. В "меню" приложения у пользователя есть возможность воспользоваться функцией "оставить отзыв", нажав на эту кнопку.
2. Открывается новое окно у пользователя, где по центру написано "что бы вы хотели добавить в игру?" , и внизу написаны уже оставленные комментарии. Игрок имеет возможность оставить свой отзыв о работе и преложить усовершенствование для игры.
3. Данные отзывы видны всем пользователям, зашедним в этот раздел.

