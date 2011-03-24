/**
 * Autogenerated
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.java_active_record.test_project.database_1;

import com.rapleaf.java_active_record.IDb;
import com.rapleaf.java_active_record.test_project.database_1.iface.ICommentPersistence;
import com.rapleaf.java_active_record.test_project.database_1.iface.IFollowerPersistence;
import com.rapleaf.java_active_record.test_project.database_1.iface.IPostPersistence;
import com.rapleaf.java_active_record.test_project.database_1.iface.IUserPersistence;

public interface IDatabase1 extends IDb {
  public ICommentPersistence comments();
  public IFollowerPersistence followers();
  public IPostPersistence posts();
  public IUserPersistence users();
}
