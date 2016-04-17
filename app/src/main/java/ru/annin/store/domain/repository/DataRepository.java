/*
 * Copyright 2016, Pavel Annin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.annin.store.domain.repository;

import android.support.annotation.NonNull;

import io.realm.RealmResults;
import ru.annin.store.domain.model.UnitModel;
import rx.Observable;

/**
 * Репозиторий данных.
 *
 * @author Pavel Annin.
 */
public interface DataRepository {

    /** Возвращает коллекцию единиц измерения. */
    Observable<RealmResults<UnitModel>> listUnits();

    Observable<UnitModel> getUnitById(String unitId);

    /**
     * Создает единицу измерния.
     * @param name Название единицы измериня.
     * @param symbol Обозначение единицы измериня.
     * @param description Описание единицы измериня.
     * @return Результат создания.
     */
    boolean createUnit(@NonNull String name, @NonNull String symbol, @NonNull String description);

    /**
     * Сохраняет единицу измерния.
     * @param unitId Идентификатор единицы измериня.
     * @param name Название единицы измериня.
     * @param symbol Обозначение единицы измериня.
     * @param description Описание единицы измериня.
     * @return Результат сохранения.
     */
    boolean saveUnit(@NonNull String unitId, @NonNull String name, @NonNull String symbol, @NonNull String description);

    boolean canUnitRemoved(@NonNull String unitId);

    boolean removeUnit(@NonNull String unitId);

}