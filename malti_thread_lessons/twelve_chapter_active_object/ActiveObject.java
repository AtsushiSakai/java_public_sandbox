/*
 * Copyright (c) 2019. Atsushi Sakai. All Rights Reserved.
 */

package twelve_chapter_active_object;

public interface ActiveObject {
    Result<String> makeString(int count, char fillchar);

    void displayString(String string);
}
