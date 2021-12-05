/*
 * Copyright (c) 2019. Atsushi Sakai. All Rights Reserved.
 */

package twelve_chapter_active_object;

public class RealResult<T> extends Result<T> {
    private final T resultValue;

    public RealResult(T resultValue) {
        this.resultValue = resultValue;
    }

    public T getResultValue() {
        return resultValue;
    }

}
