package com.platzi.jobsearch.cli;

import com.beust.jcommander.Parameter;
import lombok.Getter;


public class CLIArguments {
    CLIArguments() {

    }

    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            description = "KEYWORD"
    )
    private String keyword;

    @Parameter(
            names = {"--location", "-l"},
            description = "Cada búsqueda puede incluir una ubicación"
    )
    private String location;

    @Parameter(
            names = {"--pages", "-p"},
            description = "La API retorna 50 resultados. Usa un número para la paginación de los resultados"
    )
    private int page = 0;

    @Parameter(
            names = {"--full-time"},
            description = "Agrega este parámetro si quieres buscar trabajos de tiempo completo"
    )
    private boolean isFullTime = false;

    @Parameter(
            names = {"--markdown", "-m"},
            description = "Retorna los resultados en formato Markdown"
    )
    private boolean isMarkdown = false;

    @Parameter(
            names = {"--help", "-h"},
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "Muestra esta ayuda"
    )
    private boolean isHelp;

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkdown=" + isMarkdown +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance() {
        return new CLIArguments();
    }

    public String getKeyword() {
        return keyword;
    }

    public String getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public boolean isMarkdown() {
        return isMarkdown;
    }

    public boolean isHelp() {
        return isHelp;
    }
}
