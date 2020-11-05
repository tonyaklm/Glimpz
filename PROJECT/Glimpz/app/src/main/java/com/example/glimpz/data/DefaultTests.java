package com.example.glimpz.data;

import com.example.glimpz.Book;

import java.util.Arrays;
import java.util.List;

public class DefaultTests {

    static List<Test> tests = Arrays.asList(
            new Test(
                    Book.Balda,
                    "Тест по “Сказке о попе и о работнике его Балде“",
                    Arrays.asList(
                            new Question(
                                    "1. За скольких человек работал Балда у попа?",

                                    "За семерых",
                                    Arrays.asList(
                                            "За троих",
                                            "за пятерых",
                                            "За восьмерых"
                                    )
                            ),
                            new Question(
                                    "2. Кто придумывал хитроумные задания для Балды?",
                                    "Попадья",
                                    Arrays.asList(
                                            "Поп",
                                            "Поповна",
                                            "Попенок"
                                    )
                            ),
                            new Question(
                                    "3. Кто соревновался в беге с бесенком?",
                                    "Заяц",
                                    Arrays.asList(
                                            "Кобыла",
                                            "Петух",
                                            "Балда"
                                    )
                            ),
                            new Question(
                                    "4. Сколько зайцев поймал Балда в лесу?",
                                    "Двух",
                                    Arrays.asList(
                                            "Одного",
                                            "Трёх",
                                            "Четверых"
                                    )
                            ),
                            new Question(
                                    "5. С какого щелчка лишился поп языка?",
                                    "Со второго",
                                    Arrays.asList(
                                            "С первого",
                                            "С третьего",
                                            "С четвертого"
                                    )
                            )



                    )
            ),
            new Test(
                    Book.Ball,
                    "Тест по “После бала”",
                    Arrays.asList(
                            new Question(
                                    "1. Как зовут девушку, в которую влюблен главный герой?",

                                    "Варенька",
                                    Arrays.asList(
                                            "Ася",
                                            "Ольга",
                                            "Катерина"
                                    )
                            ),
                            new Question(
                                    "2. Кому из героев принадлежат слова \"...Будешь мазать? Будешь?..\"?",
                                    "Полковнику",
                                    Arrays.asList(
                                            "Ивану Васильевичу",
                                            "Инженеру Анисимову",
                                            "Татарину"
                                    )
                            ),
                            new Question(
                                    "3. Что особенно умиляет автора во внешности полковника на балу?",
                                    "Сапоги",
                                    Arrays.asList(
                                            "Шляпа",
                                            "Мундир",
                                            "Галстук"
                                    )
                            ),
                            new Question(
                                    "4. За что татарина наказывают шпицрутенами?",
                                    "За побег",
                                    Arrays.asList(
                                            "За воровство",
                                            "За клевету",
                                            "За пьянство"
                                    )
                            ),
                            new Question(
                                    "5. Что делает главный герой утром после бала?",
                                    "Идет гулять по городу",
                                    Arrays.asList(
                                            "Уезжает из города",
                                            "Идет в трактир",
                                            "Пишет письмо Вареньке"
                                    )
                            )

                    )
            ),
            new Test(
                    Book.Juk,
                    "Тест по “Чук и Гек”",
                    Arrays.asList(
                            new Question(
                                    "1. Кого из героев характеризуют слова «растеря и разиня»?",

                                    "Гека",
                                    Arrays.asList(
                                            "Чука",
                                            "Маму",
                                            "Отца"
                                    )
                            ),
                            new Question(
                                    "2. В каком городе жили Чук и Гек с мамой?",
                                    "В Москве",
                                    Arrays.asList(
                                            "В Санкт-Петербурге",
                                            "В Новосибирске",
                                            "В Норильске"
                                    )
                            ),
                            new Question(
                                    "3. Что случилось с телеграммой, отправленной отцом?",
                                    "Чук положил ее в коробочку, а Гек выбросил коробочку в форточку",
                                    Arrays.asList(
                                            "Гек и Чук не могли решить, кто отдаст ее маме, и случайно порвали",
                                            "Чук положил ее в тетрадь и забыл вместе с портфелем в школе",
                                            "Почтальон потерял телеграмму в троллейбусе"
                                    )
                            ),
                            new Question(
                                    "4. Где мама с мальчиками ждала Серегина?",
                                    "В сторожке",
                                    Arrays.asList(
                                            "У ямщика",
                                            "На станции",
                                            "У женщины в ближайшей деревне"
                                    )
                            ),
                            new Question(
                                    "5. Где спрятался Гек, собираясь пошутить над братом и мамой?",
                                    "В сундуке",
                                    Arrays.asList(
                                            "Под диваном",
                                            "В куче сена",
                                            "За печкой"
                                    )
                            )

                    )
            ),
            new Test(
                    Book.Killman,
                    "Тест по “Убить человека”",
                    Arrays.asList(
                            new Question(
                                    "1. Что пили главные герои?",

                                    "Виски",
                                    Arrays.asList(
                                            "Ничего не пили",
                                            "Вино",
                                            "Херес"
                                    )
                            ),
                            new Question(
                                    "2. Кто в рассказе является главным женским персонажем?",
                                    "Миссис Сетлиф",
                                    Arrays.asList(
                                            "Мисс Сетлавт",
                                            "Миссис Ситлиф",
                                            "Мис Ситлов"
                                    )
                            ),
                            new Question(
                                    "3. Кто в рассказе является главным мужским персонажем?",
                                    "Хьюги Люк",
                                    Arrays.asList(
                                            "Дэйв",
                                            "Джон Лайт",
                                            "Хэлл"
                                    )
                            ),
                            new Question(
                                    "4. Ради кого вор пошёл на дело?",
                                    "Ради приятеля",
                                    Arrays.asList(
                                            "Ради жены",
                                            "Ради матери",
                                            "Ради сына"
                                    )
                            ),
                            new Question(
                                    "5. Какая сумма нужна вору?",
                                    "300 долларов",
                                    Arrays.asList(
                                            "200 долларов",
                                            "500 долларов",
                                            "400 долларов"
                                    )
                            )

                    )
            ),
            new Test(
                    Book.Knar,
                    "Тест по “Кому на Руси жить хорошо”",
                    Arrays.asList(
                            new Question(
                                    "1. Выберите имена главных героев поэмы, отправившихся в путь:",

                                    "Роман, Демьян, Лука, братья Губины Иван и Митродор, Пахом, Пров",
                                    Arrays.asList(
                                            "Роман, Демьян, Лука, братья Губины Иван и Митродор, Ермил, Клим",
                                            "Матрена, Гриша, Влас, Савелий, братья Губины Иван и Митродор, Демушка",
                                            "Имена героев Некрасовым не названы, даны лишь деревни, из которых они родом"
                                    )
                            ),
                            new Question(
                                    "2. Что ищут главные герои поэмы?",
                                    "Кому живется весело, Вольготно на Руси?",
                                    Arrays.asList(
                                            "Свободной жизни без помещика",
                                            "Молодильные яблоки, меч-кладенец и скатерть-самобранку",
                                            "Они хотят найти себе невест по душе"
                                    )
                            ),
                            new Question(
                                    "3. Ермил Гирин – это:",
                                    "Бургомистр, прославившийся своей любовью к правде",
                                    Arrays.asList(
                                            "Один из мужиков, отправившихся искать счастья, родом из деревни Неелово",
                                            "Лакей генерала Утятина, и после отмены крепостного права не пожелавший от него уходить",
                                            "Муж Матрены"
                                    )
                            ),
                            new Question(
                                    "4. Почему крестьяне соглашаются обманывать Последыша и делают вид, что они по-прежнему его крепостные?",
                                    "Наследники князя Утятина пообещали им за это луг на Волге",
                                    Arrays.asList(
                                            "Им жаль своего доброго барина и они хотят уберечь его от нового удара",
                                            "Крестьяне уже привыкли к заведенному порядку и не желают ничего менять",
                                            "Их обманул нечистый на руку староста, который польстился на предложенные ему деньги и сжег вольные целого села"
                                    )
                            ),
                            new Question(
                                    "5. Как отомстил своему хозяину герой песни, верный холоп Яков?",
                                    "Повесился в лесу у барина на глазах",
                                    Arrays.asList(
                                            "Сбежал от хозяина",
                                            "Завёз барина в лес и убил",
                                            "Поджёг господский дом"
                                    )
                            )

                    )
            ),
            new Test(
                    Book.Levsha,
                    "Тест по “Левша”",
                    Arrays.asList(
                            new Question(
                                    "1. От чьего лица идет повествование практически во всех главах рассказа?",

                                    "От лица цехового мастера",
                                    Arrays.asList(
                                            "От лица Левши",
                                            "От лица доктора Мартына-Сокольского",
                                            "От лица донского атамана Платова"
                                    )
                            ),
                            new Question(
                                    "2. Что император купил за миллион у англичан?",
                                    "Механическую блоху",
                                    Arrays.asList(
                                            "Механического кузнечика",
                                            "Заводную стрекозу",
                                            "Заводного жука"
                                    )
                            ),
                            new Question(
                                    "3. Куда отправились тульские мастера, чтобы просить совета у иконы Николая Чудотворца?",
                                    "В Орловскую губернию",
                                    Arrays.asList(
                                            "В Воронежскую губернию",
                                            "В Самарскую губернию",
                                            "В Московскую губернию"
                                    )
                            ),
                            new Question(
                                    "4. Что сделал Левша, чем заслужил уважение у англичан?",
                                    "Подковал механическую блоху",
                                    Arrays.asList(
                                            "Усовершенствовал механизм заводной блохи",
                                            "Сделал по телу механической блохи гравировку",
                                            "Создал новую заводную блоху, еще лучше, чем у англичан"
                                    )
                            ),
                            new Question(
                                    "5. Мастером какого профиля был Левша?",
                                    "Оружейником",
                                    Arrays.asList(
                                            "Часовщиком",
                                            "Гравировщиком",
                                            " Замочником"
                                    )
                            )

                    )
            ),
            new Test(
                    Book.Rusal,
                    "Тест по “Русалочке”",
                    Arrays.asList(
                            new Question(
                                    "1. Из какого материала был построен дворец морского царя?",

                                    "Коралл",
                                    Arrays.asList(
                                            "Мрамор",
                                            "Жемчуг",
                                            "Песок"
                                    )
                            ),
                            new Question(
                                    "2. Сколько дочерей было у морского царя?",
                                    "Шесть",
                                    Arrays.asList(
                                            "Одна",
                                            "Три",
                                            "Десять"
                                    )
                            ),
                            new Question(
                                    "3. Что первым увидела самая младшая русалочка, когда впервые поднялась на поверхность моря?",
                                    "Корабль",
                                    Arrays.asList(
                                            "Айсберг",
                                            "Грозу",
                                            "Рассвет"
                                    )
                            ),
                            new Question(
                                    "4. Кто в итоге стал женой принца?",
                                    "Принцесса",
                                    Arrays.asList(
                                            "Русалочка",
                                            "Принц не женился",
                                            "Дочка фермера"
                                    )
                            ),
                            new Question(
                                    "5. Какую плату потребовала морская ведьма у русалочки взамен на человеческие ножки?",
                                    "Голос",
                                    Arrays.asList(
                                            "Жизнь",
                                            "Сундук жемчуга",
                                            "Слух"
                                    )
                            )

                    )
            ),
            new Test(
                    Book.Mozart,
                    "Тест по “Моцарт и Сальери”",
                    Arrays.asList(
                            new Question(
                                    "1. Звучание какого музыкального инструмента впечатлило Сальери в детстве?",

                                    "Органа",
                                    Arrays.asList(
                                            "Скрипки",
                                            "Фортепьяно",
                                            "Виолончели"
                                    )
                            ),
                            new Question(
                                    "2. Какой шуткой хотел развеселить Моцарт своего друга Сальери?",
                                    "Фальшивой игрой уличного скрипача",
                                    Arrays.asList(
                                            "Пародией на одно из произведений Сальери",
                                            "Рассказом о вчерашнем вечере в трактире",
                                            "Нелепым цветным костюмом"
                                    )
                            ),
                            new Question(
                                    "3. Кто заказал Моцарту создать Requiem?",
                                    "Человек в черном",
                                    Arrays.asList(
                                            "Сальери",
                                            "Знакомая цветочница",
                                            "Переодетая в простые одежды королева"
                                    )
                            ),
                            new Question(
                                    "4. Как погиб Моцарт?",
                                    "Сальери отравил Моцарта",
                                    Arrays.asList(
                                            "Сальери ранил Моцарта на дуэли",
                                            "Моцарт заболел смертельной болезнью",
                                            "Моцарт покончил жизнь самоубийством"
                                    )
                            ),
                            new Question(
                                    "5. Что тревожило Моцарта?",
                                    "Моцарту казалось, что черный человек преследует его",
                                    Arrays.asList(
                                            "Моцарту казалось, что его талант на исходе",
                                            "Моцарту казалось, что он некрасив",
                                            "Моцарту казалось, что все вокруг его обманывают"
                                    )
                            )

                    )
            ),
            new Test(
                    Book.Plenk,
                    "Тест по “Кавказский пленник”",
                    Arrays.asList(
                            new Question(
                                    "1. Какие качества проявил Жилин в плену?",

                                    "Смелость, ответственность",
                                    Arrays.asList(
                                            "Трусость, подлость",
                                            "Легкомыслие, глупость",
                                            "Трусость, глупость"
                                    )
                            ),
                            new Question(
                                    "2. Кто помог Жилину сбежать?",
                                    "Дина",
                                    Arrays.asList(
                                            "Абдул-Мурат",
                                            "Старик",
                                            "Старуха"
                                    )
                            ),
                            new Question(
                                    "3. Что стало с Костылиным?",
                                    "Его выкупили",
                                    Arrays.asList(
                                            "Заболел и умер",
                                            "Сбежал от татар",
                                            "Умер от голода"
                                    )
                            ),
                            new Question(
                                    "4. Чем занимался Жилин в плену?",
                                    "Мастерил кукол и чинил вещи",
                                    Arrays.asList(
                                            "Ухаживал за животными",
                                            "Ныл и ждал, когда пришлют выкуп",
                                            "Пытался выпросить освобождения"
                                    )
                            ),
                            new Question(
                                    "5. Сколько потребовали денег за Костылина?",
                                    "5000 рублей",
                                    Arrays.asList(
                                            "500 рублей",
                                            "2000 рублей",
                                            "4000 рублей"
                                    )
                            )

                    )
            )
    );
}