/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -207277830147000162L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"items\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Item\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"price\",\"type\":\"double\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.util.List<com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.Item> items;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public User() {}

  /**
   * All-args constructor.
   */
  public User(java.lang.Integer id, java.lang.CharSequence name, java.util.List<com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.Item> items) {
    this.id = id;
    this.name = name;
    this.items = items;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return items;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: items = (java.util.List<com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.Item>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'items' field.
   */
  public java.util.List<com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.Item> getItems() {
    return items;
  }

  /**
   * Sets the value of the 'items' field.
   * @param value the value to set.
   */
  public void setItems(java.util.List<com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.Item> value) {
    this.items = value;
  }

  /**
   * Creates a new User RecordBuilder.
   * @return A new User RecordBuilder
   */
  public static com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder newBuilder() {
    return new com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder();
  }
  
  /**
   * Creates a new User RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User RecordBuilder
   */
  public static com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder newBuilder(com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder other) {
    return new com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder(other);
  }
  
  /**
   * Creates a new User RecordBuilder by copying an existing User instance.
   * @param other The existing instance to copy.
   * @return A new User RecordBuilder
   */
  public static com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder newBuilder(com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User other) {
    return new com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder(other);
  }
  
  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private int id;
    private java.lang.CharSequence name;
    private java.util.List<com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.Item> items;

    /** Creates a new Builder */
    private Builder() {
      super(com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.SCHEMA$);
    }
    
    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.items)) {
        this.items = data().deepCopy(fields()[2].schema(), other.items);
        fieldSetFlags()[2] = true;
      }
    }
    
    /**
     * Creates a Builder by copying an existing User instance
     * @param other The existing instance to copy.
     */
    private Builder(com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User other) {
            super(com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.items)) {
        this.items = data().deepCopy(fields()[2].schema(), other.items);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Integer getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'items' field.
      * @return The value.
      */
    public java.util.List<com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.Item> getItems() {
      return items;
    }

    /**
      * Sets the value of the 'items' field.
      * @param value The value of 'items'.
      * @return This builder.
      */
    public com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder setItems(java.util.List<com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.Item> value) {
      validate(fields()[2], value);
      this.items = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'items' field has been set.
      * @return True if the 'items' field has been set, false otherwise.
      */
    public boolean hasItems() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'items' field.
      * @return This builder.
      */
    public com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.User.Builder clearItems() {
      items = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public User build() {
      try {
        User record = new User();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.items = fieldSetFlags()[2] ? this.items : (java.util.List<com.hqbhoho.bigdata.learnFlink.streaming.connectors.kafka.avro.Item>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);  

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, org.apache.avro.specific.SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);  

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, org.apache.avro.specific.SpecificData.getDecoder(in));
  }

}
