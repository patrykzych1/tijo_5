package pl.edu.pwsztar.domain.mapper;

@FunctionalInterface
public interface Converter<From, To> {
    To convert(From from);
}
