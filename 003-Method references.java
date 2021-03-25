

https://www.baeldung.com/java-method-references



List<String> messages = Arrays.asList("hello", "baeldung", "readers!");


messages.forEach(word -> StringUtils.capitalize(word));

messages.forEach(StringUtils::capitalize);
